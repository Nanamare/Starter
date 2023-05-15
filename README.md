# Starter for modern android development

![Language](https://img.shields.io/badge/Kotlin-1.8.10-brightgreen)
![Build Status](https://github.com/Nanamare/Starter/workflows/Android%20CI/badge.svg)
![License](https://img.shields.io/github/license/Drjacky/MVVMTemplate?logo=MIT)
![Star](https://img.shields.io/github/stars/nanamare?style=social)

Here is a simple project starter pack for Android developers.

## [Archtecture](https://developer.android.com/topic/architecture)
 - Following MVVM Design Pattern
 - UI Layer -> Domain Layer -> Data Layer dependency flow

## How to use? Just download or fork :)
[![Fork](https://img.shields.io/badge/-Fork%20this%20template-brightgreen)](https://github.com/Nanamare/Starter/generate)

## Features
- [Kotlin](https://kotlinlang.org/docs/getting-started.html) ([Coroutine](https://kotlinlang.org/docs/coroutines-guide.html), [Flow](https://kotlinlang.org/docs/flow.html))
- [Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
- [Jetpack](https://developer.android.com/jetpack)
  - [Compose](https://developer.android.com/jetpack/compose)
  - [Navigation](https://developer.android.com/guide/navigation/navigation-getting-started)
  - [ViewModel(AAC)](https://developer.android.com/topic/libraries/architecture/viewmodel)
  - [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview)
- [Material-Components](https://m2.material.io/)
- [Dagger-Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- [Retrofit](https://square.github.io/retrofit/)
- [OkHttp](https://square.github.io/okhttp/)
- [Kotlinx-serialization](https://kotlinlang.org/docs/serialization.html)
- [Accompanist](https://google.github.io/accompanist/)
  - [SwipeRefresh](https://google.github.io/accompanist/swiperefresh/)
  - [System-ui-controller](https://google.github.io/accompanist/systemuicontroller/)
- [Coil](https://coil-kt.github.io/coil/)
- [Room](https://developer.android.com/topic/libraries/architecture/room) ([RemoteMediator - Room paging](https://developer.android.com/topic/libraries/architecture/paging/v3-network-db))
- [Timber](https://jakewharton.github.io/timber/docs/5.x/)
- UnitTest
  - [JUnit](https://junit.org/junit5/docs/current/user-guide/)
  - [Kotlinx-coroutines-test](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/)
  - [Truth(Google)](https://truth.dev/)
  - [Mockito](https://site.mockito.org/)
  - [OkHttp(MockWebServer)](https://github.com/square/okhttp/tree/master/mockwebserver)
  - [Arch Core-testing](https://developer.android.com/jetpack/androidx/releases/arch-core)
- AndroidTest(Instrumentation Test)
  - [Expresso](https://developer.android.com/training/testing/espresso)
  - [Compose-ui-junit](https://developer.android.com/jetpack/compose/testing)
  - [Hilt-android-testing](https://developer.android.com/training/dependency-injection/hilt-testing)
- Debugging
  - [Flipper](https://fbflipper.com/docs/features/)
    - LeakCanary(MemoryLeak detection)
    - Database(Room)
    - Layout debugging
    - Navigation
    - Network
    - Shared Preference

## Dependency Management 
 - [Version Catalog (TOML)](https://docs.gradle.org/current/userguide/platforms.html)

## CI
This repository is using [**GitHub Actions**](https://github.com/Nanamare/Starter/actions)

## [Modularization](https://developer.android.com/topic/modularization)
  - App ([UI Layer](https://developer.android.com/topic/architecture/ui-layer)) android dependencies
  - Data ([Data Layer](https://developer.android.com/topic/architecture/data-layer)) network, datasource dependencies
  - Domain ([Domain Layer](https://developer.android.com/topic/architecture/domain-layer)) Pure kotlin, java (business logic)
  - Base (Collection of utility functions used in UI Layer, smilarity android-core library)
  - build-logic (Managing dependencies)
  - Test-shared (UnitTest, AndroidTest)

## ETC
 - There is a precommit hook that adds the branch name to the commit.
 - [Using plugins](https://github.com/Nanamare/Starter/tree/main/build-logic/convention/src/main/kotlin)
 - [Library Version](https://github.com/Nanamare/Starter/blob/main/gradle/libs.versions.toml)

## TODO
 - [Detekt](https://github.com/detekt/detekt) (inner precommit hook)
 - [Renovate](https://docs.renovatebot.com/modules/manager/poetry/) (Managing recently library version)

⭐ Thank you for your ⭐
