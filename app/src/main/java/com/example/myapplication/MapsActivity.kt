package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.myapplication.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val mainLocation = LatLng(33.973977, -117.328114)
        mMap.addMarker(MarkerOptions().position(mainLocation).title("UCR"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mainLocation))

        val box1= LatLng (-117.3245686,33.973691)
        val box2= LatLng (-117.3230413,33.9737365)
        val box3= LatLng (-117.3221182,33.9743244)
        val box4= LatLng (-117.320512,33.9745171)
        val box5= LatLng (-117.3195664,33.9753148)
        val box6= LatLng (-117.3183505,33.9753028)
        val box7= LatLng (-117.3221386,33.9756371)
        val box8= LatLng (-117.321272,33.9755388)
        val box9= LatLng (-117.3190285,33.9772263)
        val box10= LatLng (-117.3203521,33.976798)
        val box11= LatLng (-117.3237709,33.9768521)
        val box12= LatLng (-117.3243224,33.9762503)
        val box13= LatLng (-117.3258118,33.976633)
        val box14= LatLng (-117.3228877,33.9786475)
        val box15= LatLng (-117.3218503,33.9786629)
        val box16= LatLng (-117.3207768,33.9778799)
        val box17= LatLng (-117.320362,33.978019)
        val box18= LatLng (-117.3207381,33.9786403)
        val box19= LatLng (-117.318877,33.9792846)
        val box20= LatLng (-117.322259,33.9796985)
        val box21= LatLng (-117.3234647,33.9796514)
        val box22= LatLng (-117.3239476,33.9792059)
        val box23= LatLng (-117.3246666,33.9789699)
        val box24= LatLng (-117.3247393,33.978394)
        val box25= LatLng (-117.3250435,33.9790997)
        val box26= LatLng (-117.32556,33.9796291)
        val box27= LatLng (-117.3256797,33.9790607)
        val box28= LatLng (-117.3249889,33.9775694)
        val box29= LatLng (-117.3256375,33.9775189)
        val box30= LatLng (-117.3234121,33.9749422)
        val box31= LatLng (-117.325205,33.9750865)
        val box32= LatLng (-117.3229749,33.9711556)
        val box33= LatLng (-117.3259346,33.9702871)
        val box34= LatLng (-117.3283329,33.9704721)
        val box35= LatLng (-117.3269983,33.9694428)
        val box36= LatLng (-117.3259031,33.9678377)
        val box37= LatLng (-117.3306273,33.9696535)
        val box38= LatLng (-117.3308921,33.9706681)
        val box39= LatLng (-117.3319615,33.9703305)
        val box40= LatLng (-117.3336224,33.9694471)
        val box41= LatLng (-117.3314972,33.9687061)
        val box42= LatLng (-117.3294293,33.9709868)
        val box43= LatLng (-117.3371532,33.9731675)
        val box44= LatLng (-117.3361891,33.9742848)
        val box45= LatLng (-117.336725,33.9753572)
        val box46= LatLng (-117.3316699,33.9748853)
        val box47= LatLng (-117.3298818,33.9750984)
        val box48= LatLng (-117.3279178,33.9764774)
        val box49= LatLng (-117.327428,33.976549)
        val box50= LatLng (-117.3276021,33.9757856)
        val box51= LatLng (-117.3276225,33.9748987)
        val box52= LatLng (-117.3278389,33.973026)
        val box53= LatLng (-117.3266957,33.9718982)
        val box54= LatLng (-117.3309412,33.978894)
        val box55= LatLng (-117.3319282,33.9786669)
        val box56= LatLng (-117.333828,33.9777098)
        val box57= LatLng (-117.3334152,33.9784272)
        val box58= LatLng (-117.3328093,33.9792151)

        //adding points now


        mMap.addMarker(MarkerOptions().position(box1).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box2).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box3).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box4).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box5).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box6).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box7).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box8).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box9).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box10).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box11).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box12).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box13).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box14).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box15).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box16).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box17).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box18).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box19).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box20).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box21).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box22).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box23).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box24).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box25).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box26).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box27).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box28).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box29).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box30).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box31).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box32).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box33).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box34).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box35).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box36).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box37).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box38).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box39).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box40).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box41).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box42).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box43).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box44).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box45).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box46).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box47).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box48).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box49).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box50).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box51).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box52).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box53).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box54).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box55).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box56).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box57).title("Blue Box" ))
        mMap.addMarker(MarkerOptions().position(box58).title("Blue Box" ))

    }
}