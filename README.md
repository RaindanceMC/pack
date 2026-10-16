# RaindanceMC/pack

- **`pack-module`** — Rain's Flexible Modules — Server Pack: The one resource pack a server wears, hosted somewhere else and applied to everybody. The arbitration is RainsCore's — a player has one pack slot and several plugins want it — so this registers a hosted pack with Core rather than sending one of its own. What is here is where it is, how to check it has not changed, and the wording.
- **`pack-standalone`** — Rain's Server Pack: Rain's Server Pack, as a plugin of its own. Nothing here but a build file and a descriptor: the farm worlds module and the standard wrapper are shaded together, and that is the whole plugin.

Part of [RaindanceMC](https://github.com/RaindanceMC); built on [RainsCore](https://github.com/RaindanceMC/RainsCore) and the shared parent in [framework](https://github.com/RaindanceMC/framework). Split out of `rains-flexible-modules` on 16.10.2026, history kept.

## Build

```
mvn install
```

Needs Java 25 and read access to `packages.tstieh.de` (server ids `packages-releases` / `packages-snapshots` in `~/.m2/settings.xml`).

## Plugins

- `pack-standalone/target/RainsServerPack-1.1.0.jar` — also published as `de.raindancer.modules:pack-standalone:1.1.0`

## Versions

A module's version is a property in this repository's root `pom.xml`, a plugin's is `plugin.version` in its own pom. CI publishes every version that is not in the registry yet on the next push to master.
