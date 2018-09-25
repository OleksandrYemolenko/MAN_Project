package com.example.pls;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;

import java.util.ArrayList;
import java.util.List;

public class AlgoActivity extends AppCompatActivity {

    private RecyclerView recView;
    private LinearLayoutManager manager;
    private RecyclerAdapter adapter;
    private Intent intent;
    private String title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
      //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
      //          WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_algos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbara);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        title = "Алгоритмы";

        setTitle(title);

        recView = findViewById(R.id.algoRecView);

        manager = new LinearLayoutManager(this);

        recView.setLayoutManager(manager);

        adapter = new RecyclerAdapter();
        recView.setAdapter(adapter);
        adapter.addAll(RecyclerItem.getAlgosItem());

        Slidr.attach(this);
    }

    public void ChangeActivity(int pos, String title) {
        try {
            intent = new Intent(this, AlgoContentPageActivity.class);
            intent.putExtra("pos", pos);
            intent.putExtra("act", "a");
            intent.putExtra("title", title);
            startActivity(intent);
        } catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Exception", Toast.LENGTH_LONG).show();
        }
    }

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
        ArrayList<RecyclerItem> items = new ArrayList<>();

        public void addAll(List<RecyclerItem> items) {
            int pos = getItemCount();
            this.items.addAll(items);
            notifyItemRangeInserted(pos, this.items.size());
        }

        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recitem, parent, false);
            return new RecyclerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {
            holder.bind(items.get(position));
            holder.itemView.setOnClickListener (new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // Toast.makeText(getApplicationContext(), Integer.toString(position), Toast.LENGTH_SHORT).show();
                    ChangeActivity(position, items.get(position).getTitle());

                }
            });
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView title, desc;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            desc = (TextView) itemView.findViewById(R.id.desc);
        }

        public void bind(RecyclerItem recyclerItem) {
            desc.setText(recyclerItem.getDescription());
            title.setText(recyclerItem.getTitle());
        }
    }
}
