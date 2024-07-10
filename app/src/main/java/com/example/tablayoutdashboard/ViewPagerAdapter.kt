package com.example.tablayoutdashboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.relativelayout.ImageViewFragment
import com.example.relativelayout.TicTacToeFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        if (position==0)
            return BmiFragment()

        else if (position==1)
            return CalculatorFragment()

        else if (position==2)
            return TicTacToeFragment()

        else
            return ImageViewFragment()
    }

    override fun getPageTitle(position: Int): CharSequence {
        if (position==0)
            return "BMI"

        else if (position==1)
            return "Calculator"

        else if (position==2)
            return "Tic Tac Toe"

        else
            return "Image View"
    }
}