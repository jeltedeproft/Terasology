/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.world.biomes;

import org.terasology.entitySystem.event.Event;

public class BiomeChangeEvent implements Event {
    private Biome oldBiome;
    private Biome newBiome;

    public BiomeChangeEvent(Biome oldBiome, Biome newBiome) {
        this.oldBiome = oldBiome;
        this.newBiome = newBiome;
    }

    public Biome getOldBiome() {
        return oldBiome;
    }

    public Biome getNewBiome() {
        return newBiome;
    }
}
