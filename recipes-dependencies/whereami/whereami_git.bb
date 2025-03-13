SUMMARY = "Locate the current running executable and the current running module/library on the file system"
HOMEPAGE = "https://github.com/gpakosz/whereami"

LICENSE = "MIT | WTFPL"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=656ccaf50887360a24d25a57e2120bea \
                    file://LICENSE.WTFPLv2;md5=d493d0a0e0f4abb5354c7e56c659001d"

SRC_URI = "git://github.com/gpakosz/whereami;protocol=https;branch=master \
           file://0001-Setup-the-project-for-build-and-installation-with-CM.patch \
           "

PV = "0.1.0+git"
SRCREV = "dcb52a058dc14530ba9ae05e4339bd3ddfae0e0e"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"
