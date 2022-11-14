package info.nightscout.androidaps.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.plugins.aps.loop.APSResultObject
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.data.AutosensDataObject
import info.nightscout.core.profile.ProfileStoreObject
import info.nightscout.interfaces.pump.PumpEnactResult

@Module
@Suppress("unused")
abstract class CoreDataClassesModule {

    @ContributesAndroidInjector abstract fun pumpEnactResultInjector(): PumpEnactResult
    @ContributesAndroidInjector abstract fun apsResultInjector(): APSResultObject
    @ContributesAndroidInjector abstract fun autosensDataInjector(): AutosensDataObject

    @ContributesAndroidInjector abstract fun profileStoreInjector(): ProfileStoreObject
}
