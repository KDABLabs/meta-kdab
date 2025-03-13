SUMMARY = "A set of C++ helpers and wrappers around the C++ standard library. Event loop, windowing, input etc"
HOMEPAGE = "https://github.com/KDAB/KDUtils"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663"

SRCREV = "60b45b0050cbd2b48895ed813937fb0e947fdd2e"
SRC_URI = "git://github.com/KDAB/KDUtils;branch=main;protocol=https \
           file://0003-Set-library-SOVERSION-properties.patch \
           file://0001-Use-consistent-naming-for-whereami.patch \
           file://0002-Introduce-WaylandProtocols_PKG_CONFIG_SYSROOT_DIR.patch \
           "

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "kdbindings libxkbcommon mio spdlog pkgconfig-native wayland-native wayland-protocols-native whereami"
RDEPENDS:${PN} = "libxkbcommon spdlog wayland wayland-protocols whereami"

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"
EXTRA_OECMAKE += "-DFETCHCONTENT_FULLY_DISCONNECTED=ON"
EXTRA_OECMAKE += "-DKDUTILS_BUILD_TESTS=OFF"
EXTRA_OECMAKE += "-DKDUTILS_BUILD_EXAMPLES=OFF"

# Make sure we find the native wayland-protocols module.
EXTRA_OECMAKE += "-DWaylandProtocols_PKG_CONFIG_SYSROOT_DIR=${RECIPE_SYSROOT_NATIVE}"
