package com.example.plantilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declaramos los objetos
    RecyclerView Mostrar;
    Spinner Listado;
    List<PlantillaBarca> InicialBarca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Establecemos las referencias
        Mostrar = findViewById(R.id.mostrar);
        Listado = findViewById(R.id.listado);
        // Creamos los datos que almacenará el spinner
        String[] Barca = {"Seleccione", "Porteros", "Defensas", "Mediocampistas", "Delanteros"};
        // Creamos un ArrayAdapter tipo String le establecemos la variable y seguidamente del nombre de los datos que le daremos al spinner.
        ArrayAdapter<String> Inicial11 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Barca);
        Listado.setAdapter(Inicial11);
        Listado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Plantilla();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void Plantilla(){
        // Declaramos una variable tipo String
        String opcion;
        opcion = Listado.getSelectedItem().toString();
        // Establecemos un switch
        switch (opcion){
            // Si la persona selecciona el dato tipo String,
            // escoge "Seleccione" entra en el caso "Seleccione",
            // Se mostrarán todos los jugadores.
            case "Seleccione":
                // Creamos un arreglo
                InicialBarca = new ArrayList<>();
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.terstegen,
                                        "Marc Andre Terstegen",
                                        "Barca",
                                        "Portero",
                                        "1",
                                        "2 de Septiembre de 1992",
                                        "Alemania"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.arquero,
                                        "Iñaki Peña",
                                        "Barca",
                                        "Portero",
                                        "13",
                                        "2 de marzo de 1999",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.andreas,
                                        "Andreas Christensen",
                                        "Barca",
                                        "Defensa",
                                        "15",
                                        "10 de abril de 1996",
                                        "Dinamarca"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.araujo,
                                        "Ronald Federico Araújo da Silva",
                                        "Barca",
                                        "Defensa",
                                        "4",
                                        "13 de octubre de 2020",
                                        "Uruguay"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ericgarcia,
                                        "Eric García Martret",
                                        "Barca",
                                        "Defensa",
                                        "24",
                                        "9 de enero de 2001",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.jordialba,
                                        "Jorge Alba Ramos",
                                        "Barca",
                                        "Defensa",
                                        "18",
                                        "21 de marzo de 1989",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.kounde,
                                        "Jules Olivier Koundé",
                                        "Barca",
                                        "Defensa",
                                        "23",
                                        "12 de noviembre de 1998",
                                        "Francia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.marcosalonso,
                                        "Marcos Alonso Mendoza",
                                        "Barca",
                                        "Defensa",
                                        "17",
                                        "28 de diciembre de 1990",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.sergiroberto,
                                        "Sergi Roberto Carnicer",
                                        "Barca",
                                        "Defensa",
                                        "20",
                                        "7 de febrero de 1992",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.dejong,
                                        "Frenkie de Jong",
                                        "Barca",
                                        "Mediocampista",
                                        "21",
                                        "12 de mayo de 1997",
                                        "Paises Bajos"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.gavi,
                                        "Pablo Martín Páez Gavira",
                                        "Barcelona",
                                        "Mediocampista",
                                        "9",
                                        "5 de agosto de 2004",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.kessie,
                                        "Franck Kessié",
                                        "Barcelona",
                                        "Mediocampista",
                                        "19",
                                        "19 de diciembre de 1996",
                                        "Costa de Marfil"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.nuevo,
                                        "Marc Casadó",
                                        "Barcelona",
                                        "Mediocampista",
                                        "4",
                                        "14 de septiembre de 2003",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.paulotorres,
                                        "Pablo Torre Carral",
                                        "Barcelona",
                                        "Mediocampista",
                                        "32",
                                        "18 de julio de 2020",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.pedri,
                                        "Pedro González López",
                                        "Barcelona",
                                        "Mediocampista",
                                        "8",
                                        "25 de noviembre de 2002",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.sergiobusquets,
                                        "Sergio Busquets Burgos",
                                        "Barcelona",
                                        "Mediocampista",
                                        "5",
                                        "16 de julio de 1988",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ansufati,
                                        "Anssumane Fati Vieira",
                                        "Barcelona",
                                        "Delantero",
                                        "10",
                                        "31 de octubre de 2002",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.dembele,
                                        "Masour Ousmane Dembelé",
                                        "Barcelona",
                                        "Delantero",
                                        "7",
                                        "15 de mayo de 1997",
                                        "Francia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ferrantorres,
                                        "Ferran Torres García",
                                        "Barcelona",
                                        "Delantero",
                                        "11",
                                        "29 de febrero de 2000",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.lewandoski,
                                        "Robert Lewandowski",
                                        "Barcelona",
                                        "Delantero",
                                        "9",
                                        "21 de agosto de 1988",
                                        "Polonia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.rapinha,
                                        "Raphael Dias Belloli",
                                        "Barcelona",
                                        "Delantero",
                                        "22",
                                        "14 de diciembre de 1996",
                                        "Brasil"
                                ));
                break;
            case "Porteros":
                InicialBarca.isEmpty();
                InicialBarca = new ArrayList<>();
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.terstegen,
                                        "Marc Andre Terstegen",
                                        "Barca",
                                        "Portero",
                                        "1",
                                        "2 de Septiembre de 1992",
                                        "Alemania"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.arquero,
                                        "Iñaki Peña",
                                        "Barca",
                                        "Portero",
                                        "13",
                                        "2 de marzo de 1999",
                                        "España"
                                ));
                break;
            case "Defensas":
                InicialBarca.isEmpty();
                InicialBarca = new ArrayList<>();
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.andreas,
                                        "Andreas Christensen",
                                        "Barca",
                                        "Defensa",
                                        "15",
                                        "10 de abril de 1996",
                                        "Dinamarca"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.araujo,
                                        "Ronald Federico Araújo da Silva",
                                        "Barca",
                                        "Defensa",
                                        "4",
                                        "13 de octubre de 2020",
                                        "Uruguay"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ericgarcia,
                                        "Eric García Martret",
                                        "Barca",
                                        "Defensa",
                                        "24",
                                        "9 de enero de 2001",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.jordialba,
                                        "Jorge Alba Ramos",
                                        "Barca",
                                        "Defensa",
                                        "18",
                                        "21 de marzo de 1989",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.kounde,
                                        "Jules Olivier Koundé",
                                        "Barca",
                                        "Defensa",
                                        "23",
                                        "12 de noviembre de 1998",
                                        "Francia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.marcosalonso,
                                        "Marcos Alonso Mendoza",
                                        "Barca",
                                        "Defensa",
                                        "17",
                                        "28 de diciembre de 1990",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.sergiroberto,
                                        "Sergi Roberto Carnicer",
                                        "Barca",
                                        "Defensa",
                                        "20",
                                        "7 de febrero de 1992",
                                        "España"
                                ));
                break;
            case "Mediocampistas":
                InicialBarca.isEmpty();
                InicialBarca = new ArrayList<>();
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.dejong,
                                        "Frenkie de Jong",
                                        "Barca",
                                        "Mediocampista",
                                        "21",
                                        "12 de mayo de 1997",
                                        "Paises Bajos"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.gavi,
                                        "Pablo Martín Páez Gavira",
                                        "Barcelona",
                                        "Mediocampista",
                                        "9",
                                        "5 de agosto de 2004",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.kessie,
                                        "Franck Kessié",
                                        "Barcelona",
                                        "Mediocampista",
                                        "19",
                                        "19 de diciembre de 1996",
                                        "Costa de Marfil"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.nuevo,
                                        "Marc Casadó",
                                        "Barcelona",
                                        "Mediocampista",
                                        "4",
                                        "14 de septiembre de 2003",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.paulotorres,
                                        "Pablo Torre Carral",
                                        "Barcelona",
                                        "Mediocampista",
                                        "32",
                                        "18 de julio de 2020",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.pedri,
                                        "Pedro González López",
                                        "Barcelona",
                                        "Mediocampista",
                                        "8",
                                        "25 de noviembre de 2002",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.sergiobusquets,
                                        "Sergio Busquets Burgos",
                                        "Barcelona",
                                        "Mediocampista",
                                        "5",
                                        "16 de julio de 1988",
                                        "España"
                                ));
                break;
            case "Delanteros":
                InicialBarca.isEmpty();
                InicialBarca = new ArrayList<>();
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ansufati,
                                        "Anssumane Fati Vieira",
                                        "Barcelona",
                                        "Delantero",
                                        "10",
                                        "31 de octubre de 2002",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.dembele,
                                        "Masour Ousmane Dembelé",
                                        "Barcelona",
                                        "Delantero",
                                        "7",
                                        "15 de mayo de 1997",
                                        "Francia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.ferrantorres,
                                        "Ferran Torres García",
                                        "Barcelona",
                                        "Delantero",
                                        "11",
                                        "29 de febrero de 2000",
                                        "España"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.lewandoski,
                                        "Robert Lewandowski",
                                        "Barcelona",
                                        "Delantero",
                                        "9",
                                        "21 de agosto de 1988",
                                        "Polonia"
                                ));
                InicialBarca.add
                        (new PlantillaBarca
                                (R.drawable.rapinha,
                                        "Raphael Dias Belloli",
                                        "Barcelona",
                                        "Delantero",
                                        "22",
                                        "14 de diciembre de 1996",
                                        "Brasil"
                                ));

        }
        AdaptadorPlanillaBarca Ver11 = new AdaptadorPlanillaBarca(InicialBarca, this);
        Mostrar.setHasFixedSize(true);
        Mostrar.setLayoutManager(new LinearLayoutManager(this));
        Mostrar.setAdapter(Ver11);
    }
}