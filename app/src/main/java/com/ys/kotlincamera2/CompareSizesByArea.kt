package com.ys.kotlincamera2

import android.util.Size
import java.lang.Long.signum

class CompareSizesByArea : Comparator<Size> {

    override fun compare(lhs: Size, rhs: Size) =
        signum(lhs.width.toLong() * lhs.height - rhs.width.toLong() * rhs.height)
}