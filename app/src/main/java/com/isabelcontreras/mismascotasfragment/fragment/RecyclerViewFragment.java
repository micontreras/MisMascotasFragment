package com.isabelcontreras.mismascotasfragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.isabelcontreras.mismascotasfragment.R;
import com.isabelcontreras.mismascotasfragment.adapter.MascotaAdaptador;
import com.isabelcontreras.mismascotasfragment.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> listadoMascotas;
    private RecyclerView recyclerView;
    public MascotaAdaptador adaptador;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_recycler_view, container,false);
        /* return super.onCreateView(inflater, container, savedInstanceState);*/
        recyclerView = v.findViewById(R.id.rvMascotas);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);
        obtenerListadoMascotas();
        inicializarAdaptador();

        return v;
    }

    //Separando un poco, este hara las configuraciones
    public void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(listadoMascotas, getActivity());
        recyclerView.setAdapter(adaptador);
    }
    public void obtenerListadoMascotas() {
        listadoMascotas = new ArrayList<>();
        listadoMascotas.add(new Mascota("Perrito", 7, R.mipmap.img_perrito));
        listadoMascotas.add(new Mascota("Caballito", 1, R.mipmap.img_caballito));
        listadoMascotas.add(new Mascota("MrCaballito", 6, R.mipmap.img_caballito_mar));
        listadoMascotas.add(new Mascota("Gatito", 5, R.mipmap.img_gatito));
        listadoMascotas.add(new Mascota("Ham", 2, R.mipmap.img_hamster));
        listadoMascotas.add(new Mascota("Pajarito", 3, R.mipmap.img_pajarito));
        listadoMascotas.add(new Mascota("Patito", 4, R.mipmap.img_patito));
        listadoMascotas.add(new Mascota("Pecita", 8, R.mipmap.img_peces));
    }
}
