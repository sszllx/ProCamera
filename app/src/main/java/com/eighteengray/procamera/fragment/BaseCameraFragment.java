package com.eighteengray.procamera.fragment;


import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.eighteengray.procamera.MainActivity;
import com.eighteengray.procamera.R;
import com.eighteengray.procamera.activity.MineActivity;


public class BaseCameraFragment extends Fragment
{
    public static final int REQUEST_PERMISSIONS = 1;
    private static final String[] PERMISSIONS = {
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };




    @Override
    public void onResume()
    {
        super.onResume();
//        Log.d("CameraRecordFragment", "BaseFragmentOnResumeStart");
//        checkPermission(PERMISSIONS, REQUEST_PERMISSIONS);
//        Log.d("CameraRecordFragment", "BaseFragmentOnResumeEnd");


    }

    /*protected void checkPermission(String[] permissions, int requestCode)
    {
        if(!hasPermissionsGranted(permissions))
        {
            if (shouldShowRequestPermissionRationale(permissions))
            {
                ExplationDialogFragment.newInstance(permissions, requestCode).show(getFragmentManager(), "dialog");
            } else
            {
                Log.d("CameraRecordFragment", "requestPermissionStart");
                ActivityCompat.requestPermissions(getActivity(), permissions, requestCode);
                Log.d("CameraRecordFragment", "requestPermissionEnd");
            }

            return;
        }
    }

    private boolean hasPermissionsGranted(String[] permissions)
    {
        for (String permission : permissions)
        {
            if (ActivityCompat.checkSelfPermission(getActivity(), permission) != PackageManager.PERMISSION_GRANTED)
            {
                return false;
            }
        }
        return true;
    }


    protected boolean shouldShowRequestPermissionRationale(String[] permissions)
    {
        for (String permission : permissions)
        {
            if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), permission))
            {
                return true;
            }
        }
        return false;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        if (requestCode == REQUEST_PERMISSIONS)
        {
            if (grantResults.length == permissions.length)
            {
                for (int result : grantResults)
                {
                    if (result != PackageManager.PERMISSION_GRANTED)
                    {
                        ErrorDialogFragment.newInstance(getString(R.string.album_message)).show(getFragmentManager(), "error");
                        break;
                    }
                }
            } else
            {
                ErrorDialogFragment.newInstance(getString(R.string.album_message)).show(getFragmentManager(), "error");
            }
        } else
        {
            Log.d("CameraRecordFragment", "onRequestPermissionsResultStart");
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            Log.d("CameraRecordFragment", "onRequestPermissionsResult");
        }
    }*/


}
