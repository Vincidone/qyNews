// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zhuoren.qyNews.ui.news.presenter;

import com.zhuoren.qyNews.net.NewsApi;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

public final class DetailPresenter_Factory implements Factory<DetailPresenter> {
  private final MembersInjector<DetailPresenter> detailPresenterMembersInjector;

  private final Provider<NewsApi> newsApiProvider;

  public DetailPresenter_Factory(
      MembersInjector<DetailPresenter> detailPresenterMembersInjector,
      Provider<NewsApi> newsApiProvider) {
    assert detailPresenterMembersInjector != null;
    this.detailPresenterMembersInjector = detailPresenterMembersInjector;
    assert newsApiProvider != null;
    this.newsApiProvider = newsApiProvider;
  }

  @Override
  public DetailPresenter get() {
    return MembersInjectors.injectMembers(
        detailPresenterMembersInjector, new DetailPresenter(newsApiProvider.get()));
  }

  public static Factory<DetailPresenter> create(
      MembersInjector<DetailPresenter> detailPresenterMembersInjector,
      Provider<NewsApi> newsApiProvider) {
    return new DetailPresenter_Factory(detailPresenterMembersInjector, newsApiProvider);
  }
}
