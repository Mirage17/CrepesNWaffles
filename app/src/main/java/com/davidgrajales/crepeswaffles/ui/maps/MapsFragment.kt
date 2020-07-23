package com.davidgrajales.crepeswaffles.ui.maps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.davidgrajales.crepeswaffles.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {

    private lateinit var mMap: GoogleMap

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        mMap = googleMap

        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mMap.uiSettings.isZoomControlsEnabled = true
        //activarMyLocation()

        val CW1 = LatLng(6.161793, -75.605005)
        mMap.addMarker(MarkerOptions().position(CW1).title("Crepes&Waffles Mayorca"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW1))

        val CW2 = LatLng(6.175770, -75.592142)
        mMap.addMarker(MarkerOptions().position(CW2).title("Crepes&Waffles HomeCener Envigado"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW2))

        val CW3 = LatLng(6.170943, -75.58323188)
        mMap.addMarker(MarkerOptions().position(CW3).title("Crepes&Waffles Paradise Envigado"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW3))

        val CW4 = LatLng(6.185934, -75.569762)
        mMap.addMarker(MarkerOptions().position(CW4).title("Crepes&Waffles Campetre Drive"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW4))
        val CW5 = LatLng(6.196490, -75.574217)
        mMap.addMarker(MarkerOptions().position(CW5).title("Crepes&Waffles CC Santafe"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW5))

        val CW6 = LatLng(6.19094, -75.57416)
        mMap.addMarker(MarkerOptions().position(CW6).title("Crepes&Waffles CC Oviedo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW6))

        val CW7 = LatLng(6.197707, -75.558980)
        mMap.addMarker(MarkerOptions().position(CW7).title("Crepes&Waffles CC Los Narranjos"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW7))

        val CW8 = LatLng(6.20714, -75.571909)
        mMap.addMarker(MarkerOptions().position(CW8).title("Crepes&Waffles CC One plaza"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW8))

        val CW9 = LatLng(6.209261, -75.565623)
        mMap.addMarker(MarkerOptions().position(CW9).title("Crepes&Waffles Cr35 con cll 10A"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW9))

        val CW10 = LatLng(6.212296, -75.594622)
        mMap.addMarker(MarkerOptions().position(CW10).title("Crepes&Waffles CC Arkadia"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW10))

        val CW11 = LatLng(6.2281164, -75.604471)
        mMap.addMarker(MarkerOptions().position(CW11).title("Crepes&Waffles Urb Faroles"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW11))

        val CW12 = LatLng(6.24905, -75.594946)
        mMap.addMarker(MarkerOptions().position(CW12).title("Crepes&Waffles CC Laureles"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW12))

        val CW13 = LatLng(6.24053, -75.58668)
        mMap.addMarker(MarkerOptions().position(CW13).title("Crepes&Waffles CC Unicentro"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW13))

        val CW14 = LatLng(6.223836, -75.57420)
        mMap.addMarker(MarkerOptions().position(CW14).title("Crepes&Waffles Mercado del Rio"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW14))
        val CW15 = LatLng(6.220739, -75.566670)
        mMap.addMarker(MarkerOptions().position(CW15).title("Crepes&Waffles CC Palma Grande"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW15))
        val CW16 = LatLng(6.207197, -75.571861)
        mMap.addMarker(MarkerOptions().position(CW16).title("Crepes&Waffles One Plaza"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW16))
        val CW17 = LatLng(6.234909, -75.569782)
        mMap.addMarker(MarkerOptions().position(CW17).title("Crepes&Waffles San Diego"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CW17))

        //activarMyLocation()

    }

    /*private fun activarMyLocation() {
        if(ActivityCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )!=PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            )!=PackageManager.PERMISSION_GRANTED
        ){
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION),
                1234
            )
        }

        mMap.isMyLocationEnabled=true
    }*/


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)


    }


}