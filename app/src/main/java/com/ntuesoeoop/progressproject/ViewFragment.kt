package com.ntuesoeoop.progressproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ViewFragment : Fragment() {
    private val progressArgs: ViewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.progress_view, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //create the return process for the return button
        view.findViewById<Button>(R.id.return_button).setOnClickListener {
            findNavController().navigate(R.id.action_progress_view_to_FirstFragment)
        }

        //store the information
        view.findViewById<TextView>(R.id.textview_progress_title).text = progressArgs.progressName
        view.findViewById<TextView>(R.id.textview_progress_description).text = progressArgs.progressDescription
        view.findViewById<TextView>(R.id.textview_view_progress_period).text = progressArgs.progressPeriod
        view.findViewById<TextView>(R.id.textview_view_progress_passed_period).text = progressArgs.progressPassedPeriod

        view.findViewById<TextView>(R.id.textview_view_progress_target_completed).text = progressArgs.progressTargetCompleted
        view.findViewById<TextView>(R.id.textview_view_progress_current_completed).text = progressArgs.progressCurrentCompleted

        view.findViewById<TextView>(R.id.textview_view_progress_strike).text = progressArgs.progressStrike
        view.findViewById<TextView>(R.id.textview_view_progress_max_strike).text = progressArgs.progressMaxStrike

        view.findViewById<TextView>(R.id.textview_view_progress_count).text = progressArgs.progessCount
        view.findViewById<TextView>(R.id.textview_view_progress_target_count).text = progressArgs.progressTargetCount

        if(progressArgs.progressUsetargenum){
            view.findViewById<TextView>(R.id.textview_view_progress_target_number).text = progressArgs.progressTargetNumber
            view.findViewById<TextView>(R.id.textview_view_progress_current_number).text = progressArgs.progressCurrentNumber
        }else{
            view.findViewById<TextView>(R.id.textview_view_progress_target_number).visibility = View.INVISIBLE
            view.findViewById<TextView>(R.id.textview_view_progress_current_number).visibility = View.INVISIBLE
            view.findViewById<TextView>(R.id.textView4).visibility = View.INVISIBLE
            view.findViewById<TextView>(R.id.textView15).visibility = View.INVISIBLE
        }



    }

}