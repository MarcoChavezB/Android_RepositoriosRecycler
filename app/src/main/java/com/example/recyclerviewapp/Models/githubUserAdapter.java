package com.example.recyclerviewapp.Models;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.R;

import java.util.List;

public class githubUserAdapter extends RecyclerView.Adapter<githubUserAdapter.ViewHolder>{

    List<githubUser> infoRepository;

    public githubUserAdapter(List<githubUser> infoRepository){
        this.infoRepository = infoRepository;
    }

    @NonNull
    @Override
    public githubUserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_holder_github_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull githubUserAdapter.ViewHolder holder, int position) {
        githubUser githubUser = infoRepository.get(position);
        holder.setData(githubUser);
    }

    @Override
    public int getItemCount() {return infoRepository.size();}
    TextView txtUser, txtFollowers, txtNameRepository, txtLanguage;
    ImageView circle;
    githubUser githubUser;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtUser = itemView.findViewById(R.id.user);
            txtFollowers = itemView.findViewById(R.id.followers);
            txtNameRepository = itemView.findViewById(R.id.nameRepository);
            txtLanguage = itemView.findViewById(R.id.language);
            circle = itemView.findViewById(R.id.circle);
        }

        public void setData(githubUser git) {
            githubUser = git;
            txtUser.setText(githubUser.getUser());
            txtFollowers.setText(String.valueOf(githubUser.getFollowers()));
            txtNameRepository.setText(githubUser.getNameRepository());
            txtLanguage.setText(githubUser.getUrlImage());

            switch (txtLanguage.getText().toString()){
                case "TypeScript":
                    circle.setBackgroundTintList(ColorStateList.valueOf(0xFF3178c6));
                    break;
                case "JavaScript":
                    circle.setBackgroundTintList(ColorStateList.valueOf(0xFFb07219));
                    break;
                case "Java":
                    circle.setBackgroundTintList(ColorStateList.valueOf(0xFFb07219));
                    break;
                case "Vue":
                    circle.setBackgroundTintList(ColorStateList.valueOf(0xFF41b883));
                    break;
                case "PHP":
                    circle.setBackgroundTintList(ColorStateList.valueOf(0xFF4f5d95));
                    break;
            }
        }
    }
}
