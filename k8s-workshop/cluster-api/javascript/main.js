const k8s = require('@kubernetes/client-node');

const kc = new k8s.KubeConfig();
kc.loadFromDefault();

const k8sApi = kc.makeApiClient(k8s.CoreV1Api);

const namespace = {
    metadata: {
        name: 'xiaomo-test',
    },
};

k8sApi.createNamespace(namespace).then(
    (response) => {
        console.log('Created namespace');
        k8sApi.readNamespace(namespace.metadata.name).then((response) => {
            console.log(response.body);
            k8sApi.deleteNamespace(namespace.metadata.name, {} /* delete options */).then(
                r => console.log("delete completed!")
            );
        });
    },
    (err) => {
        console.log('Error!: ' + err);
    },
);