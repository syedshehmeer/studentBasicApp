package com.example.studentapplicationv2.ui.dashboard
import android.os.Bundle
import android.view.*
import android.widget.SearchView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentapplicationv2.CustomAdapter
import com.example.studentapplicationv2.ItemsViewModel
import com.example.studentapplicationv2.R
import com.example.studentapplicationv2.SearchRVAdapter
import com.example.studentapplicationv2.databinding.FragmentNotificationsBinding


class DashboardFragment : Fragment() {
    private lateinit var newArraylist : ArrayList<ItemsViewModel>
    private lateinit var tempArraylist : ArrayList<ItemsViewModel>

    private lateinit var searchList: ArrayList<ItemsViewModel>
    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Defines the xml file for the fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, parent, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)



        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(R.drawable.a, "Ali Ahmed "))
        data.add(ItemsViewModel(R.drawable.b, "Fatima Khan "))
        data.add(ItemsViewModel(R.drawable.c, "Uzair Ali "))
        data.add(ItemsViewModel(R.drawable.d, "Abdullah Faizan "))
        data.add(ItemsViewModel(R.drawable.e, "Areej Ali"))
        data.add(ItemsViewModel(R.drawable.f, "Syed Hamza "))
        data.add(ItemsViewModel(R.drawable.g, "Marium Khan "))
        data.add(ItemsViewModel(R.drawable.h, "Bilal Khan "))
        data.add(ItemsViewModel(R.drawable.i, "Sehar Ahmed"))
        data.add(ItemsViewModel(R.drawable.j, "Mirza Ali"))
        data.add(ItemsViewModel(R.drawable.k, "Iman Rizwan "))
        data.add(ItemsViewModel(R.drawable.l, "Muhammad Ahmed"))


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


        return view
    }

}


