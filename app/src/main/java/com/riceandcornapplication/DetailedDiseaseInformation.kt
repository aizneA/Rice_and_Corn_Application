package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.riceandcornapplication.databinding.ActivityDetailedDiseaseInformationBinding
import com.riceandcornapplication.databinding.CardCellBinding

class DetailedDiseaseInformation : AppCompatActivity() {

    private lateinit var binding: ActivityDetailedDiseaseInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedDiseaseInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //icon(?)
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.setIcon(R.mipmap.rac_launcher)

        var cropsID = intent.getIntExtra(CROP_ID_EXTRA, -1)
        var crop = cropFromID(cropsID)

        if(crop!=null){
            binding.cover.setImageResource(crop.cover)
            binding.cropDisease.text = crop.crop_disease
            binding.cropScientific.text = crop.crop_scientific
            binding.cropWhatWhy.text = crop.what_why
            binding.detailInfo.text = crop.detail_info
            binding.cropHow.text = crop.how_crop
            binding.detailInfo1.text = crop.second_info
            binding.cropImpMngmt.text = crop.imp_mngmt
            binding.detailInfo2.text = crop.third_info
            binding.diseaseCycle.setImageResource(crop.disease_cycle)
        }
    }

    private fun cropFromID(cropsID: Int): Crop?{
        for (crop in cropList){
            if(crop.id == cropsID)
                return crop
        }
        return null
    }
}