/* 
 * Copyright 2009 IT Mill Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.vaadin.chronographer.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Cronograma demo UI
 */
@SuppressWarnings("serial")
public class TimelineUI extends UI {
    private final VerticalLayout main = new VerticalLayout();
    private TabSheet tabsheet;

    @Override
    protected void init(VaadinRequest request) {
        setId("timeline-mainwindow");
        createTabSheet();

        main.setSizeFull();
        main.setImmediate(true);
        main.setId("timeline-mainwindow-content");
        setContent(main);
        main.addComponent(tabsheet);
    }

    private void createTabSheet() {
        tabsheet = new TabSheet();
        tabsheet.setId("timeline-tabsheet");
        tabsheet.addTab(new SimpleTimelineExample(), "Simple example");
        tabsheet.addTab(new MultipleTimelinesExample(), "Multiple timelines");
        tabsheet.addTab(new ComplexTimeLineExample(), "Complex example");
    }
}
