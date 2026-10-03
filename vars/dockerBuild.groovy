def call(String imageName) {

    echo 'Build stage started...'
    echo 'Building Docker image...'

    sh "docker build -t ${imageName}:${BUILD_NUMBER} ."
    sh "docker tag ${imageName}:${BUILD_NUMBER} ${imageName}:latest"

    echo 'Docker image build successful!'
}
