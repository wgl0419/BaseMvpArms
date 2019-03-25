package com.zckj.parking.di.module;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jess.arms.di.scope.ActivityScope;
import com.zckj.parking.di.scope.provideLayoutManager;
import com.zckj.parking.di.scope.provideLayoutManager2;
import com.zckj.parking.mvp.contract.MainContract;
import com.zckj.parking.mvp.model.MainModel;

import dagger.Module;
import dagger.Provides;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/29/2018 13:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public  class MainModule {

//    @Binds
//    abstract MainContract.Model bindMainModel(MainModel model);


    private MainContract.View view ;

    public MainModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainContract.View provideMainView()
    {
        return this.view;
    }

    @ActivityScope
    @Provides
    MainContract.Model provideMainModel(MainModel model)
    {
        return model;
    }


    @ActivityScope
    @Provides
    @provideLayoutManager
    RecyclerView.LayoutManager provideLayoutManager()
    {
        return new GridLayoutManager(view.getActivity(),1);
    }

    @ActivityScope
    @Provides
    @provideLayoutManager2
    RecyclerView.LayoutManager provideLayoutManager2()
    {
        return new GridLayoutManager(view.getActivity(),1);
    }

}