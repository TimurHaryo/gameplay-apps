package com.didik.gameplay.ui.home.components

import android.content.res.Resources
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.didik.gameplay.R
import com.didik.gameplay.base.BaseHolder
import com.google.android.material.card.MaterialCardView

@EpoxyModelClass
abstract class MediumSectionModel : EpoxyModelWithHolder<MediumSectionModel.Holder>() {

    @EpoxyAttribute
    lateinit var name: String

    @EpoxyAttribute
    lateinit var genre: String

    @EpoxyAttribute
    lateinit var rating: String

    @EpoxyAttribute
    lateinit var posterSize: PosterSize

    override fun getDefaultLayout(): Int = R.layout.component_medium_section

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder) {
            posterImageView.layoutParams.run {
                width = posterSize.width
                height = posterSize.height
            }
            titleTextView.text = name
            genreTextView.text = genre
            ratingTextView.text = rating
        }
    }

    class Holder : BaseHolder() {
        val containerView by bind<ConstraintLayout>(R.id.mediumSectionView)
        val posterImageView by bind<MaterialCardView>(R.id.posterImageView)
        val titleTextView by bind<AppCompatTextView>(R.id.nameTextView)
        val genreTextView by bind<AppCompatTextView>(R.id.genreTextView)
        val ratingTextView by bind<AppCompatTextView>(R.id.ratingTextView)
    }

    enum class PosterSize(val width: Int, val height: Int) {
        MEDIUM(200.toDp(), 110.toDp()),
        LARGE(265.toDp(), 145.toDp())
    }
}

fun Int.toDp(): Int = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()