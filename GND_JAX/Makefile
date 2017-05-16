default: GND_XSD

GND_XSD:
	mkdir build
	cp src/manifest.mf build
	javac `find src -name '*.java'` -d build
	cd build; jar -cmf manifest.mf ../GND_JAX.jar gnd_jax/
