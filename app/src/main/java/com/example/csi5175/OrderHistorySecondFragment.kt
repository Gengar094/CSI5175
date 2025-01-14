package com.example.csi5175

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.csi5175.databinding.FragmentOrderhistorysecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class OrderHistorySecondFragment : Fragment() {

    private var _binding: FragmentOrderhistorysecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentOrderhistorysecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.historyOrders   //The scrollView.
        binding.historyOrdersLayout //The layout in scrollView
                                    //when try to show the order history, add the data into this layout.
                                    //there is some textview in it for test, remember to delete.

        binding.orderHistorySecondBack.setOnClickListener { //Used to back the first fragment "Back"
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}