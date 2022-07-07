package com.example.appsales29032022.di;

import com.example.appsales29032022.MainActivity;
import com.example.appsales29032022.Xehoi;

import dagger.Component;

/**
 * Created by ntudroid on 7/7/2022.
 */
@Component(modules = XehoiModule.class)
public interface AppComponent {
    Xehoi getXehoi();

    void injectMainActivity(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        AppComponent build();
    }
}
