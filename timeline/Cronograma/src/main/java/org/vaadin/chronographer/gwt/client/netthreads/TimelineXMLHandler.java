/*
 * Copyright 2006 Alistair Rutherford (http://code.google.com/p/gwtsimiletimeline/)
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

package org.vaadin.chronographer.gwt.client.netthreads;

import com.google.gwt.core.client.JavaScriptObject;


/**
 * Implement this interface to receive Timeline XML completion events.
 * 
 */
public interface TimelineXMLHandler
{
    /**
     * Called when an asynchronous HTTP request completes successfully.
     *
     * @param responseText the text returned from the server
     * @param url
     */
    void onCompletion(JavaScriptObject xml, String url);
}