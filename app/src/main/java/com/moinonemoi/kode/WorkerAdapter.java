package com.moinonemoi.kode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class WorkerAdapter extends RecyclerView.Adapter<WorkerAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Worker> workers;

    WorkerAdapter(Context context,List<Worker> workers){
        this.workers = workers;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.worker_rec_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Worker worker = workers.get(position);
        holder.name.setText(worker.getName());
        holder.departament.setText(worker.getDepartament());
        holder.initials.setText(worker.getInitials());
        holder.avatar.setImageResource(worker.getAvatar());
    }

    @Override
    public int getItemCount() {
        return workers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,departament,initials;
        CircleImageView avatar;
        public ViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.text_name);
            departament = view.findViewById(R.id.text_departament);
            initials = view.findViewById(R.id.text_initials);
            avatar = view.findViewById(R.id.avatar);
        }
    }
}
