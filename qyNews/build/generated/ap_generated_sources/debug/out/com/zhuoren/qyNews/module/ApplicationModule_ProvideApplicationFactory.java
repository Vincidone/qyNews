// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zhuoren.qyNews.module;

import com.zhuoren.qyNews.MyApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideApplicationFactory implements Factory<MyApp> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideApplicationFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MyApp get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyApp> create(ApplicationModule module) {
    return new ApplicationModule_ProvideApplicationFactory(module);
  }
}
