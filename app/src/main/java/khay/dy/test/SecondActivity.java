package khay.dy.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initRecycler();
    }

    private void initRecycler() {
        final RecyclerView recyclerView = findViewById(R.id.recycler);
        final LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new RecyclerAdapter(this));
    }

    class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemHolder>{
        private Context context;

        public RecyclerAdapter(Context context) {
            this.context = context;
        }

        @NonNull
        @Override
        public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            final View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
            return new ItemHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ItemHolder extends RecyclerView.ViewHolder{
            public ItemHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}
