/*
 *  Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.github.begla.blockmania;

import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.vector.Vector3f;

/**
 * Stores the settings of the game.
 * 
 * TODO: Replace with a single hashmap
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class Configuration {

    // World
    public static Vector3f VIEWING_DISTANCE_IN_CHUNKS = new Vector3f(16.0f, 1.0f, 16.0f);
    // Debug
    public static boolean SHOW_PLACING_BOX = true;
    public static boolean SHOW_CHUNK_OUTLINES = false;
    // Display
    public static final int DISPLAY_HEIGHT = 720;
    public static final int DISPLAY_WIDTH = 1280;
    public static final boolean FULLSCREEN = false;
    // Illumination
    public static final float MAX_LIGHT = 1.0f;
    public static final float MIN_LIGHT = 0.2f;
    public static final float DIMMING_INTENS = 0.075f;
    public static final float BLOCK_SIDE_DIMMING = 0.025f;
    // Player
    public static int JUMP_INTENSITY = 10;
    public static int MAX_GRAVITY = 32;
    public static int WALKING_SPEED = 4;
    public static int RUNNING_SPEED = 32;
    public static int PLAYER_HEIGHT = 1;
    // Graphics
    public static final PixelFormat PIXEL_FORMAT = new PixelFormat();
}
