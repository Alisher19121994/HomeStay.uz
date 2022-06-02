package com.best.homestayuz.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.best.homestayuz.Fragment_Adapter_RecyclerView.Page_2_RecyclerView
import com.best.homestayuz.Fragment_Adapter_RecyclerView.Page_3_RecyclerView
import com.best.homestayuz.R
import kotlinx.android.synthetic.main.fragment_page_2.view.*
import kotlinx.android.synthetic.main.fragment_page_3.view.*

class Page_3 : Fragment() {
    lateinit var list: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_page_3, container, false)
        view.page_3_recyclerview_id.layoutManager = GridLayoutManager(context, 1)
        list = ArrayList()
        list.add(
            "This may seem like a no-brainer, but your real estate listing description should be accurate. If the house is barely 900 square feet, writing that the space is “sprawling” is dishonest. When you say a home is in “excellent condition” and there is water damage throughout the house and the back deck is rotting, a potential buyer will be turned off by seeing this on arrival. Setting unrealistic expectations helps no one." +
                    "Character can help sell a home. Is there a fireplace in the master bedroom? Or maybe an original stained glass window in the entryway? At the very least, it will help potential buyers differentiate your listing from the other dozen they are browsing.\n" +
                    "\n" +
                    "Mention a few one-of-a-kind home features in your real estate listing description and the right buyers will appreciate it. It may end up being what makes a potential buyer schedule a showing."
        )
        val adapters = Page_3_RecyclerView(list)
        view.page_3_recyclerview_id.adapter = adapters
        return view    }


}