package com.didik.gameplay.ui.moreGames

import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.airbnb.paris.annotations.Styleable
import com.didik.gameplay.R
import com.didik.gameplay.base.BaseHolder
import com.google.android.material.card.MaterialCardView

@EpoxyModelClass(layout = R.layout.component_small_section)
abstract class SmallSectionModel : EpoxyModelWithHolder<SmallSectionModel.Holder>() {

    @EpoxyAttribute
    lateinit var name: String

    @EpoxyAttribute
    lateinit var genre: String

    @EpoxyAttribute
    lateinit var rating: String

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder) {
            titleTextView.text = name
            genreTextView.text = genre
            ratingTextView.text = rating
        }
    }

    inner class Holder : BaseHolder() {
        val containerView by bind<ConstraintLayout>(R.id.smallSectionView)
        val iconImageView by bind<MaterialCardView>(R.id.iconImageView)
        val titleTextView by bind<AppCompatTextView>(R.id.nameTextView)
        val genreTextView by bind<AppCompatTextView>(R.id.genreTextView)
        val ratingTextView by bind<AppCompatTextView>(R.id.ratingTextView)
    }
}