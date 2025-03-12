SUMMARY = "Cross-platform C++11 header-only library for memory mapped file IO"
HOMEPAGE = "https://github.com/mandreyel/mio"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1c9a711c35a90bc5b390b5353f4bb71"

SRC_URI = "git://github.com/mandreyel/mio;protocol=https;branch=master"

PV = "0.1+git"
SRCREV = "8b6b7d878c89e81614d05edca7936de41ccdd2da"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"
