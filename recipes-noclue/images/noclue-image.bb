require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "noclue"

inherit extrausers
# Hashed password for 'root' is 'root', for 'stack' is 'stack"
EXTRA_USERS_PARAMS:append = "usermod -p '\$5\$7q4vxRzF\$TBB6wzmOnlIej7G6GqG0obv.pNMmh.KcKzk0usqHpZ/'   root;"
EXTRA_USERS_PARAMS:append = "useradd -p '\$5\$HkaWyz4n\$rsa5PaSktz.j79zQmsV2jDBJHpo.0/qGF1EFbINhW03' stack;"
EXTRA_USERS_PARAMS:append = "usermod -a -G sudo stack;"
IMAGE_INSTALL:append = " sudo"