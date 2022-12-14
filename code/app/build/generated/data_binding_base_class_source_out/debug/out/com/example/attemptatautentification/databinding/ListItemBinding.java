// Generated by view binder compiler. Do not edit!
package com.example.attemptatautentification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.attemptatautentification.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView cardLayout;

  @NonNull
  public final RecyclerView deadlinesList;

  @NonNull
  public final RelativeLayout expandedView;

  @NonNull
  public final ImageView eyeClosed;

  @NonNull
  public final ImageView eyeOpen;

  @NonNull
  public final TextView tvListName;

  private ListItemBinding(@NonNull MaterialCardView rootView, @NonNull MaterialCardView cardLayout,
      @NonNull RecyclerView deadlinesList, @NonNull RelativeLayout expandedView,
      @NonNull ImageView eyeClosed, @NonNull ImageView eyeOpen, @NonNull TextView tvListName) {
    this.rootView = rootView;
    this.cardLayout = cardLayout;
    this.deadlinesList = deadlinesList;
    this.expandedView = expandedView;
    this.eyeClosed = eyeClosed;
    this.eyeOpen = eyeOpen;
    this.tvListName = tvListName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      MaterialCardView cardLayout = (MaterialCardView) rootView;

      id = R.id.deadlines_list;
      RecyclerView deadlinesList = rootView.findViewById(id);
      if (deadlinesList == null) {
        break missingId;
      }

      id = R.id.expanded_view;
      RelativeLayout expandedView = rootView.findViewById(id);
      if (expandedView == null) {
        break missingId;
      }

      id = R.id.eye_closed;
      ImageView eyeClosed = rootView.findViewById(id);
      if (eyeClosed == null) {
        break missingId;
      }

      id = R.id.eye_open;
      ImageView eyeOpen = rootView.findViewById(id);
      if (eyeOpen == null) {
        break missingId;
      }

      id = R.id.tv_list_name;
      TextView tvListName = rootView.findViewById(id);
      if (tvListName == null) {
        break missingId;
      }

      return new ListItemBinding((MaterialCardView) rootView, cardLayout, deadlinesList,
          expandedView, eyeClosed, eyeOpen, tvListName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
