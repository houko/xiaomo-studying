import os
import tarfile


def tar_xml(name):
    tf = tarfile.open(name, 'w:gz')
    for name in os.listdir('./'):
        if name.endswith('.xml'):
            tf.add(name)
            os.remove(name)
    tf.close()

    # 如果是个空的压缩包，就把删掉
    if not tf.members:
        os.remove(name)


tar_xml('test.tar.gz')
