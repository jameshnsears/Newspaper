package com.github.ayltai.newspaper.app.view.binding;

import org.junit.Assert;
import org.junit.Test;

import com.github.ayltai.newspaper.UnitTest;
import com.github.ayltai.newspaper.app.data.model.NewsItem;
import com.github.ayltai.newspaper.app.widget.CompactItemView;

public final class CompactItemBinderFactoryTest extends UnitTest {
    @Test
    public void test() {
        final CompactItemBinderFactory factory = new CompactItemBinderFactory();

        Assert.assertEquals(CompactItemView.VIEW_TYPE, factory.getPartType());
        Assert.assertFalse(factory.isNeeded(null));
        Assert.assertTrue(factory.isNeeded(new NewsItem()));
    }
}