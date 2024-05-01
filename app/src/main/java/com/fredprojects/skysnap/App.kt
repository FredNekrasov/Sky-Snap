package com.fredprojects.skysnap

import android.app.Application
import com.fredprojects.main.di.*
import com.fredprojects.search.di.*
import com.fredprojects.tickets.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                dataMainModule, domainMainModule, presentationMainModule,
                dataSearchModule, domainSearchModule, presentationSearchModule,
                dataTicketsModule, domainTicketsModule, presentationTicketsModule
            )
        }
    }
}