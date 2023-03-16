package View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moinonemoi.kode.R;

import java.util.ArrayList;
import java.util.List;

import Model.JsonPlaceHolder;
import Model.Item;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Worker> workers = new ArrayList<Worker>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeDate();

        recView = findViewById(R.id.recyclerView);
        WorkerAdapter workerAdapter = new WorkerAdapter(this,workers);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(workerAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:3000/users")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);
        Call<List<Item>> call =jsonPlaceHolder.getItems();

        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if(!response.isSuccessful()) {
                    System.out.println("Code:" + response.code());
                }

                List<Item> items = response.body();

                for(Item item : items) {

                }

            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

    }

    private void initializeDate(){
        workers.add(new Worker(R.drawable.cat,"Иван","analyst","bi"));
    }
}