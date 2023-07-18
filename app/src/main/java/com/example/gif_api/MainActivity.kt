package com.example.gif_api

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.api_2.ApiClient
import com.example.api_2.ApiInterface
import com.example.gif_api.Modal.GifModal
import com.example.gif_api.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var key = "LIVDSRZULELA"
    lateinit var adapter: GifAdapter
    lateinit var binding: ActivityMainBinding
    var page = 1
    private  val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        callAip( page)
        adapter = GifAdapter()
        binding.btnSerch.setOnClickListener {

            callAip( page)
        }
        binding.setOnScroll.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            // on scroll change we are checking when users scroll as bottom.
            if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
                // in this method we are incrementing page number,
                // making progress bar visible and calling get data method.
                page++
                binding.progrebar.setVisibility(View.VISIBLE)
                callAip(page)


            }
        })

    }



    private fun callAip( page: Int) {

        var txt = binding.edtSearch.text.toString()

        var api: ApiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
        api.getGif(key,page.toString(),txt).enqueue(object : Callback<GifModal>{
            override fun onResponse(call: Call<GifModal>, response: Response<GifModal>) {

                if (response.isSuccessful){

                    var photos = response.body()?.results
                    adapter.setPhotos(photos)
                    binding.rcvList.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
                    binding.rcvList.adapter = adapter

                }
                else{
                    Log.e(TAG, "onFailure: erfgf "+response.toString() )


                }
            }

            override fun onFailure(call: Call<GifModal>, t: Throwable) {
                Log.e(TAG, "onFailure: "+t.message, )

            }

        })
    }
}


