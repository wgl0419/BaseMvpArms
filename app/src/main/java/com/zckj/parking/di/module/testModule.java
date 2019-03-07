package com.zckj.parking.di.module;


import com.jess.arms.di.scope.ActivityScope;
import com.zckj.parking.mvp.contract.testContract;
import com.zckj.parking.mvp.model.testModel;

import dagger.Module;
import dagger.Provides;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 03/07/2019 16:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public class testModule {
    private testContract.View view ;

    public testModule(testContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
   testContract.View providetestView()
   {
       return this.view;
   }

    @ActivityScope
    @Provides
    testContract.Model providetestModel(testModel model)
    {
        return model;
    }
}