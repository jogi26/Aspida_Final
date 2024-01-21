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
        mMap.run {
            addMarker(MarkerOptions().position(mainLocation).title("UCR"))
            moveCamera(CameraUpdateFactory.newLatLngZoom(mainLocation, 15f))
        }

        val box1= LatLng (33.973691,-117.3245686)
        val box2= LatLng (33.9737365,-117.3230413)
        val box3= LatLng (33.9743244,-117.3221182)
        val box4= LatLng (33.9745171,-117.320512)
        val box5= LatLng (33.9753148,-117.3195664)
        val box6= LatLng (33.9753028,-117.3183505)
        val box7= LatLng (33.9756371,-117.3221386)
        val box8= LatLng (33.9755388,-117.321272)
        val box9= LatLng (33.9772263,-117.3190285)
        val box10= LatLng (33.976798,-117.3203521)
        val box11= LatLng (33.9768521,-117.3237709)
        val box12= LatLng (33.9762503,-117.3243224)
        val box13= LatLng (33.976633,-117.3258118)
        val box14= LatLng (33.9786475,-117.3228877)
        val box15= LatLng (33.9786629,-117.3218503)
        val box16= LatLng (33.9778799,-117.3207768)
        val box17= LatLng (33.978019,-117.320362)
        val box18= LatLng (33.9786403,-117.3207381)
        val box19= LatLng (33.9792846,-117.318877)
        val box20= LatLng (33.9796985,-117.322259)
        val box21= LatLng (33.9796514,-117.3234647)
        val box22= LatLng (33.9792059,-117.3239476)
        val box23= LatLng (33.9789699,-117.3246666)
        val box24= LatLng (33.978394,-117.3247393)
        val box25= LatLng (33.9790997,-117.3250435)
        val box26= LatLng (33.9796291,-117.32556)
        val box27= LatLng (33.9790607,-117.3256797)
        val box28= LatLng (33.9775694,-117.3249889)
        val box29= LatLng (33.9775189,-117.3256375)
        val box30= LatLng (33.9749422,-117.3234121)
        val box31= LatLng (33.9750865,-117.325205)
        val box32= LatLng (33.9711556,-117.3229749)
        val box33= LatLng (33.9702871,-117.3259346)
        val box34= LatLng (33.9704721,-117.3283329)
        val box35= LatLng (33.9694428,-117.3269983)
        val box36= LatLng (33.9678377,-117.3259031)
        val box37= LatLng (33.9696535,-117.3306273)
        val box38= LatLng (33.9706681,-117.3308921)
        val box39= LatLng (33.9703305,-117.3319615)
        val box40= LatLng (33.9694471,-117.3336224)
        val box41= LatLng (33.9687061,-117.3314972)
        val box42= LatLng (33.9709868,-117.3294293)
        val box43= LatLng (33.9731675,-117.3371532)
        val box44= LatLng (33.9742848,-117.3361891)
        val box45= LatLng (33.9753572,-117.336725)
        val box46= LatLng (33.9748853,-117.3316699)
        val box47= LatLng (33.9750984,-117.3298818)
        val box48= LatLng (33.9764774,-117.3279178)
        val box49= LatLng (33.976549,-117.327428)
        val box50= LatLng (33.9757856,-117.3276021)
        val box51= LatLng (33.9748987,-117.3276225)
        val box52= LatLng (33.973026,-117.3278389)
        val box53= LatLng (33.9718982,-117.3266957)
        val box54= LatLng (33.978894,-117.3309412)
        val box55= LatLng (33.9786669,-117.3319282)
        val box56= LatLng (33.9777098,-117.333828)
        val box57= LatLng (33.9784272,-117.3334152)
        val box58= LatLng (33.9792151,-117.3328093)


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