stage('Build') {
    node('master') {
        echo "Build stage"
    }
}

stage('Test') {
    parallel(
    a: {
        node('Node1') {
            sleep 10
            build 'sertianLab6Job1'
        }
    },
    b: {
        node('master') {
            echo 'Branch B'
        }
    }
    )
}

stage('Deploy') {
    node('master') {
        echo "Deploy stage"
    }
}
