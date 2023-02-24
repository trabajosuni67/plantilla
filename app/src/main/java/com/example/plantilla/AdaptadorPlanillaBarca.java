package com.example.plantilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPlanillaBarca extends RecyclerView.Adapter<AdaptadorPlanillaBarca.ViewHolder>{
    List<PlantillaBarca> MiBarca;
    LayoutInflater MiInflaterBAR;
    Context Vamos;

    public AdaptadorPlanillaBarca(List<PlantillaBarca> miBarca, Context vamos) {
        MiBarca = miBarca;
        MiInflaterBAR = LayoutInflater.from(vamos);
        Vamos = vamos;
    }

    @NonNull
    @Override
    public AdaptadorPlanillaBarca.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Barca = MiInflaterBAR.inflate(R.layout.activity_plantilla_barca, null);
        return new  AdaptadorPlanillaBarca.ViewHolder(Barca);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPlanillaBarca.ViewHolder holder, int position) {
        holder.BinData(MiBarca.get(position));
    }

    @Override
    public int getItemCount() {
        return MiBarca.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView Mostrar;
        TextView Nom, Equ, Pos, Dor, Fech, Nac;
        ViewHolder( View Plantel){
            super(Plantel);
            Mostrar = Plantel.findViewById(R.id.Verimagen);
            Nom = Plantel.findViewById(R.id.MostrarNom);
            Equ = Plantel.findViewById(R.id.MostrarEquipo);
            Pos = Plantel.findViewById(R.id.MostrarPosicion);
            Dor = Plantel.findViewById(R.id.MostrarDorsal);
            Fech = Plantel.findViewById(R.id.MostrarFecha);
            Nac = Plantel.findViewById(R.id.MostrarNacimiento);
        }
        public void BinData(final PlantillaBarca MiEquipo){
            Mostrar.setImageResource(MiEquipo.getFoto());
            Nom.setText(MiEquipo.getVerNombre());
            Equ.setText(MiEquipo.getVerEquipo());
            Pos.setText(MiEquipo.getVerPosicion());
            Dor.setText(MiEquipo.getVerNum());
            Fech.setText(MiEquipo.getConocerNacimiento());
            Nac.setText(MiEquipo.getVerNacionalidad());
        }
    }
}
