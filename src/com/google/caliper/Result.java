/**
 * Copyright (C) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.caliper;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * The complete result of a benchmark suite run.
 */
final class Result {

  private final ImmutableMap<Run, Double> measurements;

  Result(Map<Run, Double> measurements) {
    this.measurements = ImmutableMap.copyOf(measurements);
  }

  ImmutableMap<Run, Double> getMeasurements() {
    return measurements;
  }
}