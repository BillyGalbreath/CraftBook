/*
 * CraftBook Copyright (C) 2010-2018 sk89q <http://www.sk89q.com>
 * CraftBook Copyright (C) 2011-2018 me4502 <http://www.me4502.com>
 * CraftBook Copyright (C) Contributors
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.sk89q.craftbook.core;

import com.sk89q.craftbook.core.util.CraftBookException;

/**
 * The base class for any CraftBook mechanic.
 */
public interface Mechanic {

    /**
     * Gets the name of the mechanic.
     *
     * @return The name
     */
    String getName();

    /**
     * Called when the mechanic should initialize.
     *
     * @throws CraftBookException Occurs when the mechanic can not be started.
     */
    void onInitialize() throws CraftBookException;

    /**
     * Called when the mechanic should be disabled.
     */
    void onDisable();

}
