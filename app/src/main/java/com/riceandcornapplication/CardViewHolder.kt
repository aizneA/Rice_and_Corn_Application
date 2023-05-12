package com.riceandcornapplication

import androidx.recyclerview.widget.RecyclerView
import com.riceandcornapplication.databinding.CardCellBinding

class CardViewHolder (
        private val cardCellBinding: CardCellBinding,
        private val clickListener: CropClickListener
        ) : RecyclerView.ViewHolder(cardCellBinding.root)
{
        fun bindCrop(crop: Crop)
        {
                cardCellBinding.cover.setImageResource(crop.cover)
                cardCellBinding.cropDisease.text = crop.crop_disease
                cardCellBinding.cropScientific.text = crop.crop_scientific
                cardCellBinding.cardView.setOnClickListener {
                        clickListener.onClick(crop)
                }
        }
        }