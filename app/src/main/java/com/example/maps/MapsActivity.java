package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng wr = new LatLng(-7.920526, 112.594853);
        mMap.addMarker(new MarkerOptions().position(wr).title("Warung Makan Bu-Elga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wr));

        LatLng pom = new LatLng(-7.920777, 112.595092);
        mMap.addMarker(new MarkerOptions().position(pom).title("SPBU Universitas Muhammadiyah Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom));

        LatLng pol = new LatLng(-7.912750, 112.584607);
        mMap.addMarker(new MarkerOptions().position(pol).title("Polsek Dau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pol));

        LatLng tm = new LatLng(-7.915373, 112.588910);
        mMap.addMarker(new MarkerOptions().position(tm).title("Sengkaling Water Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tm));

        LatLng kt = new LatLng(-7.920508, 112.594365);
        mMap.addMarker(new MarkerOptions().position(kt).title("KANTOR KEPALA DESA MULYO AGUNG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kt));

        LatLng sk = new LatLng(-7.917148, 112.588155);
        mMap.addMarker(new MarkerOptions().position(sk).title("SDN Mulyoagung 01"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sk));
    }
}
