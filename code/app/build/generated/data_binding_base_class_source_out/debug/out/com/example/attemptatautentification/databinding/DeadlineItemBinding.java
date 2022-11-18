// Generated by view binder compiler. Do not edit!
package com.example.attemptatautentification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.attemptatautentification.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DeadlineItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView category;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView deadline;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView notes;

  @NonNull
  public final RatingBar ratingBar;

  private DeadlineItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView category,
      @NonNull CheckBox checkBox, @NonNull TextView date, @NonNull TextView deadline,
      @NonNull TextView name, @NonNull TextView notes, @NonNull RatingBar ratingBar) {
    this.rootView = rootView;
    this.category = category;
    this.checkBox = checkBox;
    this.date = date;
    this.deadline = deadline;
    this.name = name;
    this.notes = notes;
    this.ratingBar = ratingBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DeadlineItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DeadlineItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.deadline_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DeadlineItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category;
      TextView category = rootView.findViewById(id);
      if (category == null) {
        break missingId;
      }

      id = R.id.checkBox;
      CheckBox checkBox = rootView.findViewById(id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.deadline;
      TextView deadline = rootView.findViewById(id);
      if (deadline == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.notes;
      TextView notes = rootView.findViewById(id);
      if (notes == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = rootView.findViewById(id);
      if (ratingBar == null) {
        break missingId;
      }

      return new DeadlineItemBinding((ConstraintLayout) rootView, category, checkBox, date,
          deadline, name, notes, ratingBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}