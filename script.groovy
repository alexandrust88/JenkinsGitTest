stage('Build') {
    node('master') {
        echo "Build stage"
    }
}

stage('Test') {
    parallel(
    a: {
        node('master') {
            sleep 10
            build 'sertianLab6Job1'
        }
    },
    b: {
        node('Node1') {
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
