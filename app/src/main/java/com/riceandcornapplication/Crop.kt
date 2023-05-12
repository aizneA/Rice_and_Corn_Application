package com.riceandcornapplication

var cropList = mutableListOf<Crop>()

val CROP_ID_EXTRA = "cropExtra"

class Crop (
    var cover: Int,
    var crop_disease: String,
    var crop_scientific: String,
    var what_why: String,
    var how_crop: String,
    var imp_mngmt: String,
    var detail_info: String,
    var second_info: String,
    var third_info: String,
    var disease_cycle: Int,
    val id: Int? = cropList.size
)