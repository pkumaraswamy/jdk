/*
 * Copyright (c) 1998, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.beans.beancontext.BeanContextServiceRevokedListener;

/**
 * The listener interface for receiving
 * {@code BeanContextServiceAvailableEvent} objects.
 * A class that is interested in processing a
 * {@code BeanContextServiceAvailableEvent} implements this interface.
 */

@SuppressWarnings("removal")
@Deprecated(since = "23", forRemoval = true)
public interface BeanContextServicesListener extends BeanContextServiceRevokedListener {

    /**
     * The service named has been registered. getService requests for
     * this service may now be made.
     * @param bcsae the {@code BeanContextServiceAvailableEvent}
     */
    void serviceAvailable(BeanContextServiceAvailableEvent bcsae);
}
